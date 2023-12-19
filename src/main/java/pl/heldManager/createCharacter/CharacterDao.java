package pl.heldManager.createCharacter;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pl.heldManager.player.Player;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

@Repository
@Transactional
public interface CharacterDao extends JpaRepository<Character, Long> {


//
//    @PersistenceContext
//    private EntityManager entityManager;
//    public void saveCharacter(Character character) {
//        entityManager.persist(character);
//    }
//
//    public List<Character> listAllCharacters(){
//
////        Query q = EntityManager.createQuery("SELECT c from Character c");
//        ArrayList<Character> characters = new ArrayList<>();
////        for (int i = 0; entityManager.find(Character.class,i)!=null; i++) {
//            characters.add(entityManager.find(Character.class,1));
//            System.out.println(entityManager.find(Character.class,1));
////        }
//        return characters;
//    }
//    public void deleteCharacters(Character character) {
//        entityManager.remove(character);
//    }
}
