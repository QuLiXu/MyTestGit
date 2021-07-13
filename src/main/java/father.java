abstract class father {
    private String name;
    private int sno;
    public String sex="mysex";

    public father(String name, int sno) {
        this.name = name;
        this.sno = sno;
    }
    public void getname(){
        System.out.println();
    }

    @Override
    public String toString() {
        return "father{" +
                "name='" + name + '\'' +
                ", sno=" + sno +
                '}';
    }
}
