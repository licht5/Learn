package second;

class Single {
    private static Single Instance=new Single();
    private Single(){

    }
    public static Single getInstance(){
        return Instance;
    }

}


