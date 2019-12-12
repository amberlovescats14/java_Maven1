import com.google.common.base.Joiner;

public class First {
    public static void main(String[] args) {
        Joiner joiner = Joiner.on(";").skipNulls();
        String amber = joiner.join("amber", null, "jones");
        System.out.println(amber);
    }

}
