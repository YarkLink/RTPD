
public class Inventory {
	private Item[][] inv;
	private Item weaponSlot;
	private Item armourSlot;
	private Item miscSlot1;
	private Item miscSlot2;
	private Seed[][] seedPouchInv = null;
	private Scroll[][] ScrollFolderInv = null;
	private Potion[][] PotionBasketInv = null;
	private byte counter;

	public Inventory(Item starterWeapon, Item starterArmour, Item starterMiscSlot1, Item starterMiscSlot2,
			Item[] starterItems) {
		inv = new Item[5][8];
		this.weaponSlot = starterWeapon;
		this.armourSlot = starterArmour;
		this.miscSlot1 = starterMiscSlot1;
		this.miscSlot2 = starterMiscSlot2;
		counter = 0;
		for (byte i = 0; i < starterItems.length; i++) {
			addItem(starterItems[i]);
		}

	}

	public boolean addItem(Item addon) {
		if (counter == 40) {
			return false;
		} else {
			inv[counter / 8][counter % 8] = addon;
			counter++;
			return true;
		}
	}

	public Item getItem(int row, int col) {
		return inv[row][col];
	}

	public Item[][] getInventory() {
		return inv;
	}

	public void setWeapon(Item weapon) {
		this.weaponSlot = weapon;
	}

	public void setArmour(Item armour) {
		this.armourSlot = armour;
	}

	public void setMiscSlot1(Item misc) {
		this.miscSlot1 = misc;
	}

	public void setMiscSlot2(Item misc) {
		this.miscSlot1 = misc;
	}

	public Item getWeapon() {
		return this.weaponSlot;
	}

	public Item getArmour() {
		return this.armourSlot;
	}

	public Item getMiscSlot1() {
		return this.miscSlot1;
	}

	public Item getMiscSlot2() {
		return this.miscSlot2;
	}

	public boolean checkSpace() {
		for (byte i = 0; i < inv.length; i++) {
			for (byte k = 0; k < inv[i].length; k++) {
				if (inv[i][k] != null) {
					return true;
				}
			}
		}
		return false;
	}

}
