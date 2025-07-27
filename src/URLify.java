public class URLify {
    public String urlify(String input) {

        String s = input.replace(" ", "%20");

        return s;
    }

    public static void main(String[] args) {

        URLify urlify = new URLify();

        System.out.println(urlify.urlify("Hello World"));
        System.out.println(urlify.urlify("Mr 3ohn Smith 13"));
    }
}
