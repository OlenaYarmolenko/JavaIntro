/**
 * Created by olena on 16.09.18.
 */
public class Extra1 {

    public static void main(String[] args) {
        String[] friends = new String[10];
        friends[0] = "Oleh";
        friends[1] = "Borys";
        friends[2] = "Dima";
        friends[8] = "Alex";
        friends[9] = "Nata";

        int TotalFriends = friends.length;
        int i=0;

        for (i=0; i<TotalFriends; i++){
            if (friends[i]==null) {
                continue;
            }
            System.out.println("I love "+friends[i]);
        }
        System.out.println("The iteration is over");
    }
}
