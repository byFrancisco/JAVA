public class MiRombo {
    public static void main(String[] args){
        Rombo objRMO = new Rombo();
        objRMO.setA(25);
        objRMO.setB(25);
        objRMO.setC(25);
        objRMO.setD(25);
        objRMO.setDimension("2D");
        System.out.println("coordenada x:" + objRMO.getA());
        System.out.println("coordenada y:" + objRMO.getB());
        System.out.println("coordenada b:" + objRMO.getC());
        System.out.println("coordenada c:"  + objRMO.getD());
        System.out.println("Dimension: "+ objRMO.getDimension());
    }
}
