package a0327.member1;

public class Member1 {
    private class Member {
        private String name;
        private int age;
        private String email;
        
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public int getAge() {
            return age;
        }
        public void setAge(int age) {
            this.age = age;
        }
        public String getEmail() {
            return email;
        }
        public void setEmail(String email) {
            this.email = email;
        }
        @Override
        public String toString() {
            return "Member [이름 : " + name + ", 나이 : " + age + ", 이메일 : " + email + "]";
        }
    }
}
