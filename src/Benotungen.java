public class Benotungen {
    public int[] durchgefallen(int[] noten) {
        for(int i = 0; i < noten.length; ++i) {
            if (noten[i] > 100 || noten[i] < 0) {
                throw new IllegalArgumentException("Falsche Werte fuer die Noten");
            }
        }

        int count = 0;

        for(int j = 0; j < noten.length; ++j) {
            if (noten[j] < 40) {
                ++count;
            }
        }

        int[] durchfallnoten = new int[count];
        int index = 0;

        for(int i = 0; i < noten.length; ++i) {
            if (noten[i] < 40) {
                durchfallnoten[index++] = noten[i];
            }
        }

        return durchfallnoten;
    }

    public float mittelwertnote(int[] noten) {
        float sum = 0.0F;

        for(int i = 0; i < noten.length; ++i) {
            if (noten[i] > 100 || noten[i] < 0) {
                throw new IllegalArgumentException("Falsche Werte fuer die Noten");
            }

            sum += (float)noten[i];
        }

        return (float)Math.round(sum / (float)noten.length * 100.0F) / 100.0F;
    }
}
