package Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Entity.Classifica;

// We create our repository, the <> typing defines the entity class acting as a schema, and type of the ID
public interface ClassificaRepository extends JpaRepository<Classifica, Integer> {


}