package dp_abstract_factory_rp_characters;

import charClasses.Fighter;
import charClasses.Heavy;
import charClasses.Ranger;
import charClasses.SpellCaster;

public class PlayGame {

	public static void main(String[] args) {
		EquipmentFactory fantasyEquipmentFactory = new FantasyEquipmentFactory();
		EquipmentFactory sciFiEquipmentFactory = new SciFiEquipmentFactory();
		
		Fighter fantasyFighter = new Fighter(fantasyEquipmentFactory, "George");
		fantasyFighter.gearUp();
		
		System.out.println(fantasyFighter.useArmor());
		System.out.println(fantasyFighter.useHeadGear());
		System.out.println(fantasyFighter.useAccessory());
		System.out.println(fantasyFighter.useMainHand());
		System.out.println(fantasyFighter.useOffHand());
		System.out.println("---------------------------------------");
		
		SpellCaster fantasySpellCaster = new SpellCaster(fantasyEquipmentFactory, "Paul");
		fantasySpellCaster.gearUp();
		
		System.out.println(fantasySpellCaster.useRobe());
		System.out.println("---------------------------------------");
		
		Heavy fantasyHeavy = new Heavy(fantasyEquipmentFactory, "John");
		fantasyHeavy.gearUp();
		
		System.out.println(fantasyHeavy.useArmor());
		System.out.println(fantasyHeavy.useAccessory());
		System.out.println(fantasyHeavy.useHeadGear());
		System.out.println(fantasyHeavy.useTwoHand());
		System.out.println("---------------------------------------");
		
		Ranger fantasyRanger = new Ranger(fantasyEquipmentFactory, "Ringo");
		fantasyRanger.gearUp();
		
		System.out.println(fantasyRanger.useAccessory());
		System.out.println(fantasyRanger.useRangeWep());
		System.out.println("---------------------------------------");
		
		Fighter sciFiFighter = new Fighter(sciFiEquipmentFactory, "Paul");
		sciFiFighter.gearUp();
		
		System.out.println(sciFiFighter.useArmor());
		System.out.println(sciFiFighter.useHeadGear());
		System.out.println(sciFiFighter.useAccessory());
		System.out.println(sciFiFighter.useMainHand());
		System.out.println(sciFiFighter.useOffHand());
		System.out.println("---------------------------------------");
		
		SpellCaster sciFiSpellCaster = new SpellCaster(sciFiEquipmentFactory, "Ace");
		sciFiSpellCaster.gearUp();
		
		System.out.println(sciFiSpellCaster.useRobe());
		System.out.println("---------------------------------------");

		Heavy sciFiHeavy = new Heavy(sciFiEquipmentFactory, "Gene");
		sciFiHeavy.gearUp();
		
		System.out.println(sciFiHeavy.useArmor());
		System.out.println(sciFiHeavy.useAccessory());
		System.out.println(sciFiHeavy.useHeadGear());
		System.out.println(sciFiHeavy.useTwoHand());
		System.out.println("---------------------------------------");
		
		Ranger sciFiRanger = new Ranger(sciFiEquipmentFactory, "Peter");
		sciFiRanger.gearUp();
		
		System.out.println(sciFiRanger.useAccessory());
		System.out.println(sciFiRanger.useRangeWep());
		
	}

}
