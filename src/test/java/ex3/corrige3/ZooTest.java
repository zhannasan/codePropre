package ex3.corrige3;

import static org.junit.Assert.*;

import org.junit.Test;

import ex3.corrige3.animaux.Mammifere;
import ex3.corrige3.animaux.Poisson;
import ex3.corrige3.animaux.Reptile;
import ex3.corrige3.zones.TypeZone;

public class ZooTest {

	@Test
	public void testConstructor() {
		Zoo zoo = new Zoo("Untel");
		
		// Je vérifie que le nom du zoo est bien valorisé
		assertEquals("Untel", zoo.getNom());
		
		// Je vérifie que les zones sont non nulles
		assertNotNull(zoo.getZones());
		
		// Je vérifie qu'il y a bien 4 zones dans mon zoo
		assertTrue(zoo.getZones().size()==4);
	}
	
	@Test
	public void testGetZoneByType(){
		Zoo zoo = new Zoo("Untel");
		
		// Je vérifie que j'ai bien 4 zones à raison de 1 par type
		assertNotNull(zoo.getZoneByType(TypeZone.SAVANE_AFRICAINE));
		assertNotNull(zoo.getZoneByType(TypeZone.ZONE_CARNIVORE));
		assertNotNull(zoo.getZoneByType(TypeZone.FERME_REPTILE));
		assertNotNull(zoo.getZoneByType(TypeZone.AQUARIUM));
		
		// Je vérifie les cas aux limites
		assertNull(zoo.getZoneByType(null));
	}
	
	@Test
	public void testAddAnimal(){
		Zoo zoo = new Zoo("Untel");
		
		// J'ajoute 4 animaux différents dans le zoo
		zoo.addAnimal(new Mammifere("Gazelle", Comportement.HERBIVORE));
		zoo.addAnimal(new Mammifere("Lion", Comportement.CARNIVORE));
		zoo.addAnimal(new Poisson("Requin", Comportement.CARNIVORE));
		zoo.addAnimal(new Reptile("Boa", Comportement.CARNIVORE));
		
		// Je vérifie que chaque animal arrive dans une zone distincte
		assertTrue(zoo.getZoneByType(TypeZone.SAVANE_AFRICAINE).compterAnimaux()==1);
		assertTrue(zoo.getZoneByType(TypeZone.ZONE_CARNIVORE).compterAnimaux()==1);
		assertTrue(zoo.getZoneByType(TypeZone.FERME_REPTILE).compterAnimaux()==1);
		assertTrue(zoo.getZoneByType(TypeZone.AQUARIUM).compterAnimaux()==1);
	}
	
	@Test
	public void testAddAnimalNull(){
		Zoo zoo = new Zoo("Untel");
		
		// J'ajoute un animal null
		zoo.addAnimal(null);
		
		// Je vérifie que la méthode a rien fait
		assertTrue(zoo.compterAnimaux()==0);
	}

}
