package br.com.javase.projetosPessoais.MediaDeAprovados;

public class Teacher {

    private String teacher;
    private int idade;
    private String twitter;
    private String instagram;
    private String facebook;

    public Teacher() {

    }

    public Teacher(String teacher, byte idade, String twitter, String instagram, String facebook) {
        this.teacher = teacher;
        this.idade = idade;
        this.twitter = twitter;
        this.instagram = instagram;
        this.facebook = facebook;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    public String getInstagram() {
        return instagram;
    }

    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }
    
    public void printDataTeacher(){
        
        System.out.println("DATAS OF TEACHER");
        System.out.println("Name of teacher : " + teacher);
        System.out.println("Twitter : " + twitter);
        System.out.println("Instram : " + instagram);
        System.out.println("Facebook : " + facebook);
        
    }

}
