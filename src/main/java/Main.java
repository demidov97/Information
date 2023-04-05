public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Сергей";
        post.passport = "5555 № 123456";
        post.patronymic = "Иванович";
        post.phone = "+7 (903)-022-22-34";
        post.surname = "Демидов";
        post.subscription = true;
        post.birthday = new FormDate();
        post.birthday.day = 1;
        post.birthday.month = 4;
        post.birthday.year = 1997;

    }
}
