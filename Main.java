public class Main{
    public static void main(String[] args){
        Review[] one = {
        new Review(4, "Good! Thx"),
        new Review(3, "OK site"),
        new Review(5, "Great!"),
        new Review(2, "Poor! Bad."),
        new Review(3, "")
        };

        ReviewAnalysis r = new ReviewAnalysis(one);
        System.out.println(r.getAverageRating());
    }
}