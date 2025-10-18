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
        float sum = 0;

        for(int i = 0; i < noten.length; ++i) {
            if (noten[i] > 100 || noten[i] < 0) {
                throw new IllegalArgumentException("Falsche Werte fuer die Noten");
            }

            sum += (float)noten[i];
        }

        return (float)Math.round(sum / (float)noten.length * 100.0F) / 100.0F;
    }

    private int rundenote(int note) {

        if (note < 38) {
            return note;
        }

        int nextMultiple = (int) (Math.ceil(note / 5.0) * 5);

        if (nextMultiple - note < 3) {
            return nextMultiple;
        }

        return note;
    }

    public int[] abgerundetenoten(int[] noten) {
        if (noten.length == 0) {
            throw new IllegalArgumentException("Notenarray muss nicht Null sein");
        }

        int[] abgerundet = new int[noten.length];

        for (int i = 0; i < noten.length; i++) {
            if (noten[i] < 0 || noten[i] > 100) {
                throw new IllegalArgumentException("Note muss zwischen 0 und 100 sein");
            }

            abgerundet[i] = rundenote(noten[i]);
        }

        return abgerundet;
    }

    public int maxabgerundetenote(int[] noten) {
        if (noten.length == 0) {
            throw new IllegalArgumentException("Notenarray muss nicht Null sein");
        }

        int[] abgerundet = abgerundetenoten(noten);
        int maxNote = abgerundet[0];

        for (int i = 1; i < abgerundet.length; i++) {
            if (abgerundet[i] > maxNote) {
                maxNote = abgerundet[i];
            }
        }

        return maxNote;
    }
}
