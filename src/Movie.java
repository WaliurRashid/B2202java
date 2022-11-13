public class Movie {
    public static String title;
    public static String studio;
    public static String rating;

    public Movie (String t, String s, String r){
    }

    public Movie (String t, String s){
        title = t;
        studio = s;
        rating = "PG";
    }

    public String getTitle(){
        return title + " " + studio + " " + rating;
    }

    public static void main(String[] args) {
        Movie m = new Movie("Hawwa", "BD");
        System.out.println(m.getTitle());
    }


}
