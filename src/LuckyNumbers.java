public class LuckyNumbers {
    /* No instance variables */

    /* "empty" constructor with no parameters */
    public LuckyNumbers() { }

    /* Generates a random number between min and max, inclusive,
       and returns that random number
     */
    public int randomIntegerBetween(int min, int max) {
        min = 1;
        max = 65;
    int randomInt1 = (int)(Math.random()*(max-min+1)+min);
    return randomInt1;
    }

    /* Generates and returns a String containing lucky numbers

       For this lucky number game, there are 5 balls randomly drawn,
       each between 1 and 65, and one "super ball" between 1 and 30.

       In this game, the same number CAN appear more than once.

       The returned String should have the 6 numbers listed (they do not
       need to be in ascending order): 5 "lucky numbers" between 1 and 65,
       and the last one, the "super ball," between 1 and 30.
       See samples below.

       This method should call your randomIntegerBetween method above multiple times
      */
    public String getLuckyNumbers() {
        /*int randomInt1 = (int)(Math.random()*(max-min+1)+min);
        int randomInt2 = (int)(Math.random()*(max-min+1)+min);
        int randomInt3 = (int)(Math.random()*(max-min+1)+min);
        int randomInt4 = (int)(Math.random()*(max-min+1)+min);
        int randomInt5 = (int)(Math.random()*(max-min+1)+min);*/
        String luckyNumbers = ("Your lucky numbers are: "+randomInt1+" "+randomInt2+" "+randomInt3+" "+randomInt4+" "+randomInt5);
        return luckyNumbers;
        /* implement this method  */
    }
}
