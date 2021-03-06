package com.mewin.worldguardregionapi;

/**
 * describes the way how a player left/entered a region
 *
 * @author mewin
 */
public enum MovementType {
	MOVE,
	RIDE(false),
	TELEPORT,
	WORLD_CHANGE(false),
	SPAWN(false),
	DISCONNECT(false);

	private boolean cancellable;

	MovementType() {
		this.cancellable = true;
	}

	MovementType(boolean cancellable) {
		this.cancellable = cancellable;
	}

	public boolean isCancellable() {
		return cancellable;
	}
}
