package charClasses;

import dp_abstract_factory_rp_characters.EquipmentFactory;
import robe.Robe;

public class SpellCaster implements Character {
	
	private String name;
	private EquipmentFactory equipmentFactory;
	private Robe robe;
	
	public SpellCaster(EquipmentFactory equipmentFactory, String name){
		this.equipmentFactory = equipmentFactory;
		this.name = name;
	}

	public void gearUp() {
		this.robe = equipmentFactory.createRobe();
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String useRobe(){
		return name + robe.action();
	}
}
