package io;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CopierTest {

    @Test
    public void testBinaryCopy(){
        Copier.copyBinary("java-duke.png", "copied_image.png");
    }

    @Test
    public void testTextCopy(){
        Copier.textCopy("LICENSE", "LICENSE_BK");
    }

    @Test
    public void testLineTextCopy(){
        Copier.lineTextCopy("LICENSE", "LICENSE_BK");
    }

    @Test
    public void testSaveToFile(){
        Copier.saveToFile(new Entity("name", 10));
    }

    @Test
    public void testReadFromFile(){
        Entity entity = Copier.readFromFile("name");
        Assertions.assertEquals(10, entity.getSize());
    }

    @Test
    public void testCopyEntireFile(){
        Copier.copyEntireFile("java-duke.png", "copied_entire_image.png");
    }

    @Test
    public void testReadFileChannel(){
        Copier.readFileChannel("poezie.txt");
    }

    @Test
    public void testCopyFileChannel(){
        Copier.copyFileChannel("poezie.txt", "poezie_copy.txt");
    }
}
