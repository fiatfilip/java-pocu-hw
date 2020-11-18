package io;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Copier {
    private static Logger logger = LogManager.getLogger(Copier.class);
    public static void copyBinary(String source, String destination){

        try(
                InputStream inputStream = new FileInputStream(source);
                OutputStream outputStream = new FileOutputStream(destination)
        ){
            int readValue;

            while((readValue = inputStream.read()) != -1){
                outputStream.write(readValue);
            }

        }catch (IOException ioException){
            logger.error(ioException);
        }
    }

    public static void textCopy(String source, String destination) {
        try (
                FileReader fileReader = new FileReader(source);
                FileWriter fileWriter = new FileWriter(destination)
        ) {
            int readValue;

            while ((readValue = fileReader.read()) != -1) {
                fileWriter.write(readValue);
            }
        } catch (FileNotFoundException fileNotFoundException) {
            logger.error(fileNotFoundException);
        } catch (IOException ioException) {
            logger.error(ioException);
        }
    }
    public static void lineTextCopy(String source, String destination) {
        try (
                BufferedReader bufferedReader = new BufferedReader(new FileReader(source));
                PrintWriter printWriter = new PrintWriter(new FileWriter(destination))
        ) {
            String line;

            while((line = bufferedReader.readLine()) != null){
                printWriter.write(line + "\n");
            }
        } catch (FileNotFoundException fileNotFoundException) {
            logger.error(fileNotFoundException);
        } catch (IOException ioException) {
            logger.error(ioException);
        }
    }

    public static void saveToFile(Entity entity){
        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(
                new FileOutputStream(entity.getName() + ".data"))){
            objectOutputStream.writeObject(entity);
        }catch (IOException ioException){
            logger.error(ioException);
        }
    }

    public static Entity readFromFile(String name){
        try(ObjectInputStream objectInputStream = new ObjectInputStream(
                new FileInputStream(name + ".data"))){
            Entity entity = (Entity)objectInputStream.readObject();
            System.err.println(entity.getName() + ":" + entity.getSize());
            return entity;
        }catch (IOException ioException){
            logger.error(ioException);
        } catch (ClassNotFoundException e) {
            System.err.println("Class not found");
        }
        return null;
    }

    public static void copyEntireFile(String source, String destination){
        try{
            byte[] content = Files.readAllBytes(Paths.get(source));
            Files.write(Paths.get(destination), content);
        }catch (IOException ioException){
            logger.error(ioException);
        }
    }

    public static void readFileChannel(String source){
        try{
            FileChannel readChannel = FileChannel.open(Paths.get(source));
            ByteBuffer readingBuffer = ByteBuffer.allocate(64);

            int readBytes;
            while((readBytes = readChannel.read(readingBuffer)) != -1){
                // System.out.println("Read " + readBytes + " bytes");

                byte[] value = new byte[readBytes];
                readingBuffer.flip();
                readingBuffer.get(value);

                // System.out.println(new String(value, "UTF-8"));

            }
        }catch (IOException ioException){
            logger.error(ioException);
        }
    }

    public static void copyFileChannel(String source, String destination){
        try{
            FileChannel readChannel = FileChannel.open(Paths.get(source));
            ByteBuffer readingBuffer = ByteBuffer.allocate(64);

            FileChannel writeChannel = FileChannel.open(Paths.get(destination),
                    StandardOpenOption.CREATE,
                    StandardOpenOption.WRITE);

            int readBytes;
            while((readBytes = readChannel.read(readingBuffer)) != -1){
                // System.out.println("Read " + readBytes + " bytes");

                byte[] value = new byte[readBytes];
                readingBuffer.flip();
                readingBuffer.get(value);
                readingBuffer.flip();

                writeChannel.write(ByteBuffer.wrap(value));

                // System.out.println(new String(value, "UTF-8"));

            }
        }catch (IOException ioException){
            logger.error(ioException);
        }
    }
}
