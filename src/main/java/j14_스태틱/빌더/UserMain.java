package j14_스태틱.빌더;

public class UserMain {
    public static void main(String[] args) {
        User user = User.builder()
                .username("user")
                .password("1234")
                .email("ft179@naver.com")
                .name("고희주")
                .build(); // ==return

        System.out.println(user);
    }
}
