package dp_abstract_factory_rp_characters;

import accessory.Accessory;
import accessory.OmniTool;
import armor.Armor;
import armor.KevlarVest;
import headGear.HeadGear;
import headGear.TechGoggles;
import mainHand.MainHand;
import mainHand.VibroBlade;
import offHand.OffHand;
import offHand.SonicShield;
import rangeWep.RangeWep;
import rangeWep.LaserRifle;
import robe.Robe;
import robe.ThermOpticCamo;
import twoHand.TwoHand;
import twoHand.GEPGun;

public class SciFiEquipmentFactory implements EquipmentFactory {

	public MainHand createMainHand() {
		return new VibroBlade();
	}

	public OffHand createOffHand() {
		return new SonicShield();
	}

	public RangeWep createRangeWep() {
		return new LaserRifle();
	}

	public TwoHand createTwoHand() {
		return new GEPGun();
	}

	public Armor createArmor() {
		return new KevlarVest();
	}

	public Robe createRobe() {
		return new ThermOpticCamo();
	}

	public HeadGear createHeadgear() {
		return new TechGoggles();
	}

	public Accessory createAccessory() {
		return new OmniTool();
	}
}
