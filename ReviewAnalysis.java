public class ReviewAnalysis{
    private Review[] allReviews;

    public ReviewAnalysis(Review[] reviews){
        allReviews = reviews;

    }

    public double getAverageRating(){
        double sum = 0;
        for(Review r : allReviews){
            sum += r.getRating();
        }
        return sum / allReviews.length;
    }

    public ArrayList<String> collectComments(){

    }
}