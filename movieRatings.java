public class movieRatings {
    // The main class will prompt the user for the amount of movies they want to rate, and then gets the ratings from the website, focus group, and movie critics, and display the averages.

    // This will get the rating from the website, getting three integers from the user, and then returning the array
    public static double[] getWebsiteRating(int movieNumber) {
        // This will prompt the user for the three ratings, and then store them in an array.
        System.out.println("Please enter three ratings for movie " + movieNumber + " from the website, separated by a space.");
        String websiteRatingString = System.console().readLine();
        String[] websiteRatingStringArray = websiteRatingString.split(" ");

        // This will convert the three ratings from strings to integers, and then store them in an array.
        double[] websiteRatingArray = new double [3];
        for (int i = 0; i < 3; i++) {
            websiteRatingArray[i] = Double.parseDouble(websiteRatingStringArray[i]);
        }

        // This will return the array.
        return websiteRatingArray;
    }

    // This will get the rating from the focus group, getting two doubles from the user, and then returning the array
    public static double[] getFocusGroupRating(int movieNumber) {
        // This will prompt the user for the two ratings, and then store them in an array.
        System.out.println("Please enter two ratings for movie " + movieNumber + " from the focus group, separated by a space.");
        String focusGroupRatingString = System.console().readLine();
        String[] focusGroupRatingStringArray = focusGroupRatingString.split(" ");

        // This will convert the two ratings from strings to doubles, and then store them in an array.
        double[] focusGroupRatingArray = new double[2];
        for (int i = 0; i < 2; i++) {
            focusGroupRatingArray[i] = Double.parseDouble(focusGroupRatingStringArray[i]);
        }

        // This will return the array.
        return focusGroupRatingArray;
    }

    // This will get the rating from the movie critics, getting a single double, and then returning the value
    public static double[] getMovieCriticRating(int movieNumber) {
        // This will prompt the user for the rating, and then store it in a double.
        System.out.println("Please enter a rating for movie " + movieNumber + " from the movie critics.");
        String movieCriticRatingString = System.console().readLine();
        double[] movieCriticRating = new double[1];
        movieCriticRating[0] = Double.parseDouble(movieCriticRatingString);

        // This will return the value.
        return movieCriticRating;
    }

    public static void main(String[] args) {
        // This will prompt the user for the amount of movies they want to rate.
        System.out.println("How many movies do you want to rate?");

        // This will get the amount of movies the user wants to rate, as a string, and then convert it to an integer if there are no errors.
        String amountOfMoviesString = System.console().readLine();

        // If the user enters an incorrect value for the amount of movies (Such as "One", or -1), it will print an error message and exit the program.
        int amountOfMovies;
        try {
            amountOfMovies = Integer.parseInt(amountOfMoviesString);
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid value.");
            return;
        }

        // This will get the ratings from each source, and store them in a 2d array.
        double[][][] ratings = new double[amountOfMovies][3][];

        // This will loop through each movie, and get the ratings from each source.
        for (int i = 0; i < amountOfMovies; i++) {
            // This will get the ratings from the website, focus group, and movie critics, and store them in the ratings array.
            ratings[i][0] = getWebsiteRating(i);
            ratings[i][1] = getFocusGroupRating(i);
            ratings[i][2] = getMovieCriticRating(i);
        }

        // This will calculate the average rating for each movie, and store it in an array.
        double[] averageRatings = new double[amountOfMovies];
        for (int i = 0; i < amountOfMovies; i++) {
            // This will calculate the average rating for each movie, and store it in the averageRatings array.
            double totalRating = 0;
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < ratings[i][j].length; k++) {
                    totalRating += ratings[i][j][k];
                }
            }
            averageRatings[i] = totalRating / (ratings[i][0].length + ratings[i][1].length + ratings[i][2].length);
        }

        // This will print the average rating for each movie.
        for (int i = 0; i < amountOfMovies; i++) {
            System.out.println("The average rating for movie " + i + " is " + averageRatings[i]);
        }

        
    }
}
