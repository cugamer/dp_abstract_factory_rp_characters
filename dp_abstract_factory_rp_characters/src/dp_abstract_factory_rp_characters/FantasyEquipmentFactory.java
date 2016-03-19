package dp_abstract_factory_rp_characters;

import accessory.Accessory;
import accessory.ProtectionAmulet;
import armor.Armor;
import armor.PlateMail;
import headGear.HeadGear;
import headGear.SteelHelm;
import mainHand.MainHand;
import mainHand.Sword;
import offHand.OffHand;
import offHand.Shield;
import rangeWep.RangeWep;
import rangeWep.Bow;
import robe.Robe;
import robe.WizardRobe;
import twoHand.TwoHand;
import twoHand.GreatSword;

public class FantasyEquipmentFactory implements EquipmentFactory {

	public MainHand createMainHand() {
		return new Sword();
	}
	
	public OffHand createOffHand() {
		return new Shield();
	}
	
	public RangeWep createRangeWep() {
		return new Bow();
	}
	
	public TwoHand createTwoHand() {
		return new GreatSword();
	}
	
	public Armor createArmor() {
		return new PlateMail();
	}
	
	public Robe createRobe() {
		return new WizardRobe();
	}
	
	public HeadGear createHeadgear() {
		return new SteelHelm();
	}
	
	public Accessory createAccessory() {
		return new ProtectionAmulet();
	}
}
