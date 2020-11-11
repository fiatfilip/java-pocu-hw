package enums;

public enum Luna {
    IAN, FEB, MAR, APR, MAI, IUN, IUL, AUG, SEP, OCT, NOI, DEC;

    public Anotimp getAnotimp(){
        return aflaAnotimpul(this);
    }

    public static Anotimp aflaAnotimpul(Luna luna){
        switch (luna){
            case DEC:
            case IAN:
            case FEB:
                return Anotimp.Iarna;
            case MAR:
            case APR:
            case MAI:
                return Anotimp.Primavara;
            case IUN:
            case IUL:
            case AUG:
                return Anotimp.Vara;
            case SEP:
            case OCT:
            case NOI:
                return Anotimp.Toamna;
//            default:
//                return "Anotimp necunoscut";
        }
        return null;
    }

}
