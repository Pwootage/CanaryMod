package net.canarymod.api.entity.living.animal;

import net.canarymod.Canary;
import net.canarymod.api.entity.EntityType;
import net.canarymod.api.entity.living.LivingBase;
import net.canarymod.api.entity.vehicle.CanaryAnimalVehicle;
import net.canarymod.api.inventory.CanaryAnimalInventory;
import net.canarymod.api.inventory.Inventory;
import net.minecraft.entity.passive.EntityHorse;

/**
 * Horse wrapper implementation
 *
 * @author Jason (darkdiplomat)
 */
public class CanaryHorse extends CanaryAnimalVehicle implements Horse {

    public CanaryHorse(EntityHorse entity) {
        super(entity);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EntityType getEntityType() {
        switch (getType()) {
            case DONKEY:
                return EntityType.DONKEY;
            case HORSE:
                return EntityType.HORSE;
            case MULE:
                return EntityType.MULE;
            case SKELETON:
                return EntityType.SKELETONHORSE;
            case ZOMBIE:
                return EntityType.ZOMBIEHORSE;
            default:
                return EntityType.HORSE;
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getFqName() {
        return "Horse";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isEatingHay() {
        return getHandle().ck();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isBred() {
        return getHandle().cm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setIsBred(boolean bred) {
        getHandle().k(bred);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isChested() {
        return getHandle().ci();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setIsChested(boolean chested) {
        getHandle().l(chested);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean hasReproduced() {
        return getHandle().cn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setHasReproduced(boolean reproduced) {
        getHandle().m(reproduced);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HorseType getType() {
        return HorseType.values()[getRawType()];
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getRawType() {
        return getHandle().bX();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setType(HorseType type) {
        this.setType(type.ordinal());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setType(int type) {
        getHandle().s(type);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getVariant() {
        return getHandle().bY();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setVariant(int variant) {
        getHandle().t(variant);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getTemper() {
        return getHandle().co();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setTemper(int temper) {
        getHandle().u(temper);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isTamed() {
        return getHandle().ca();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setTamed(boolean tame) {
        getHandle().i(tame);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Inventory getInventory() {
        return getHandle().bG != null ? new CanaryAnimalInventory(getHandle().bG, this) : null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getGrowingAge() {
        return getHandle().d();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setGrowingAge(int age) {
        getHandle().c(age);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LivingBase getOwner() {
        return Canary.getServer().getPlayer(getOwnerName());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getOwnerName() {
        return getHandle().cf();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setOwner(LivingBase entity) {
        setOwner(entity.getName());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setOwner(String name) {
        getHandle().b(name);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isSitting() {
        return false;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setSitting(boolean sitting) {
    } // Horses can't sit

    /**
     * {@inheritDoc}
     */
    @Override
    public EntityHorse getHandle() {
        return (EntityHorse) entity;
    }
}
