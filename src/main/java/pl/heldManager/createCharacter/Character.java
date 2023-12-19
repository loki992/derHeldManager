package pl.heldManager.createCharacter;

import org.hibernate.validator.constraints.Range;
import pl.heldManager.player.Player;

import javax.persistence.*;

@Entity
@Table(name = "characters")
public class Character {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    private Player player;

//    @OneToOne
//    private BasicSkills basicSkills;


    private String name;
    private String surname;
    private int age;
    private String job;
    private boolean sex_male;
    private String homeCity;
    private String birthCity;

    @Range(min = 1, max = 100, message="Wartość musi być zprzedziału 1-100")
    private int sanity;
    @Range(min = 1, max = 100, message="Wartość musi być zprzedziału 1-100")

    private int luck;
    private boolean tempInsane = false;
    private boolean shortTempInsane = false;

    @Range(min = 0, max = 100, message="Wartość musi być zprzedziału 0-100")

    private int hp;
    private boolean severeWound = false;
    @Range(min = 0, max = 100, message="Wartość musi być zprzedziału 0-100")
    private int mp;

    @Range(min = 1, max = 100, message="Wartość musi być zprzedziału 1-100")
    private int strength;
    @Range(min = 1, max = 100, message="Wartość musi być zprzedziału 1-100")
    private int dexterity;
    @Range(min = 1, max = 100, message="Wartość musi być zprzedziału 1-100")
    private int fitness;
    @Range(min = 1, max = 100, message="Wartość musi być zprzedziału 1-100")
    private int power;
    @Range(min = 1, max = 100, message="Wartość musi być zprzedziału 1-100")
    private int looks;
    @Range(min = 1, max = 100, message="Wartość musi być zprzedziału 1-100")
    private int education;
    @Range(min = 1, max = 100, message="Wartość musi być zprzedziału 1-100")
    private int physique;
    @Range(min = 1, max = 100, message="Wartość musi być zprzedziału 1-100")
    private int inteligence;
    @Range(min = 1, max = 100, message="Wartość musi być zprzedziału 1-100")
    private int movement;


    public Character() {
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getPlayerId() {
        return player.getId();
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
//
//    public BasicSkills getBasicSkills() {
//        return basicSkills;
//    }
//
//    public void setBasicSkills(BasicSkills basicSkills) {
//        this.basicSkills = basicSkills;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public boolean isSex_male() {
        return sex_male;
    }

    public void setSex_male(boolean sex_male) {
        this.sex_male = sex_male;
    }

    public String getHomeCity() {
        return homeCity;
    }

    public void setHomeCity(String homeCity) {
        this.homeCity = homeCity;
    }

    public String getBirthCity() {
        return birthCity;
    }

    public void setBirthCity(String birthCity) {
        this.birthCity = birthCity;
    }

    public int getSanity() {
        return sanity;
    }

    public void setSanity(int sanity) {
        this.sanity = sanity;
    }

    public int getLuck() {
        return luck;
    }

    public void setLuck(int luck) {
        this.luck = luck;
    }

    public boolean isTempInsane() {
        return tempInsane;
    }

    public void setTempInsane(boolean tempInsane) {
        this.tempInsane = tempInsane;
    }

    public boolean isShortTempInsane() {
        return shortTempInsane;
    }

    public void setShortTempInsane(boolean shortTempInsane) {
        this.shortTempInsane = shortTempInsane;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public boolean isSevereWound() {
        return severeWound;
    }

    public void setSevereWound(boolean severeWound) {
        this.severeWound = severeWound;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getFitness() {
        return fitness;
    }

    public void setFitness(int fitness) {
        this.fitness = fitness;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getLooks() {
        return looks;
    }

    public void setLooks(int looks) {
        this.looks = looks;
    }

    public int getEducation() {
        return education;
    }

    public void setEducation(int education) {
        this.education = education;
    }

    public int getPhysique() {
        return physique;
    }

    public void setPhysique(int physique) {
        this.physique = physique;
    }

    public int getInteligence() {
        return inteligence;
    }

    public void setInteligence(int inteligence) {
        this.inteligence = inteligence;
    }

    public int getMovement() {
        return movement;
    }

    public void setMovement(int movement) {
        this.movement = movement;
    }
}
