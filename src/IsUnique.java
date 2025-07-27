public class IsUnique {

    public boolean isUnique(String word) {

        for(int i = 0; i < word.length() - 1; i++) {

            if(word.charAt(i) == word.charAt(i+1)) {

                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        IsUnique isUnique = new IsUnique();

        System.out.println(isUnique.isUnique("leet"));
        System.out.println(isUnique.isUnique("love"));

    }


}
