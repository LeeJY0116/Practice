package ljy2;

import java.util.Random;

public class Word
{
    private Random generator = new Random();

    public Word()
    {
        generator = new Random();
        final long SEED = 42;
        generator.setSeed(SEED);
    }


    public String scramble(String word)
    {
        for (int count = 0; count < word.length(); count++)
        {
            int i = getRandomInRange(word, 0, word.length() -1);
            int j = getRandomInRange(word, i + 1, word.length());

            String first = word.substring(0, i);
            String letterAti = word.substring(i, i + 1);
            String middle = word.substring(i + 1, j);
            String letterAtj = word.substring(j, j + 1);
            String last = word.substring(j + 1);

            word =  first + letterAtj + middle + letterAti + last;
        }
        return word;
    }

    private int getRandomInRange(String word,int low, int high)
    {
        int value = generator.nextInt(high - low) + low;
        return value;
    }
    
    public static void main(String[] a) {
    	Word wword = new Word();
    }
}