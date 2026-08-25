public class ArraysMatrizes {
    public static void main (String[] args) {

        int[] valores = new int[5];
        boolean[] sensores = new boolean[5];

        sensores[3] = true;

        for (int i = 0; i < sensores.length; i++) {
             //System.out.println (sensores[i]);
            sensores[i] = true;
        }

        //for enhanced
        for (boolean sensor : sensores) {
            System.out.println (sensor);
        }

    }
}