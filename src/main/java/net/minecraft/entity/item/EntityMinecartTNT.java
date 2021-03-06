package net.minecraft.entity.item;

import net.canarymod.api.entity.vehicle.CanaryTNTMinecart;
import net.minecraft.block.Block;
import net.minecraft.block.BlockRailBase;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;

public class EntityMinecartTNT extends EntityMinecart {

    public int a = -1; // CanaryMod: private -> public

    public EntityMinecartTNT(World world) {
        super(world);
        this.entity = new CanaryTNTMinecart(this); // CanaryMod: Wrap Entity
    }

    public EntityMinecartTNT(World world, double d0, double d1, double d2) {
        super(world, d0, d1, d2);
        this.entity = new CanaryTNTMinecart(this); // CanaryMod: Wrap Entity
    }

    public int m() {
        return 3;
    }

    public Block o() {
        return Blocks.W;
    }

    public void h() {
        super.h();
        if (this.a > 0) {
            --this.a;
            this.p.a("smoke", this.t, this.u + 0.5D, this.v, 0.0D, 0.0D, 0.0D);
        }
        else if (this.a == 0) {
            this.c(this.w * this.w + this.y * this.y);
        }

        if (this.F) {
            double d0 = this.w * this.w + this.y * this.y;

            if (d0 >= 0.009999999776482582D) {
                this.c(d0);
            }
        }
    }

    public void a(DamageSource damagesource) {
        super.a(damagesource);
        double d0 = this.w * this.w + this.y * this.y;

        if (!damagesource.c()) {
            this.a(new ItemStack(Blocks.W, 1), 0.0F);
        }

        if (damagesource.o() || damagesource.c() || d0 >= 0.009999999776482582D) {
            this.c(d0);
        }
    }

    protected void c(double d0) {
        if (!this.p.E) {
            double d1 = Math.sqrt(d0);

            if (d1 > 5.0D) {
                d1 = 5.0D;
            }

            this.p.a(this, this.t, this.u, this.v, (float) (4.0D + this.aa.nextDouble() * 1.5D * d1), true);
            this.B();
        }
    }

    protected void b(float f0) {
        if (f0 >= 3.0F) {
            float f1 = f0 / 10.0F;

            this.c((double) (f1 * f1));
        }

        super.b(f0);
    }

    public void a(int i0, int i1, int i2, boolean flag0) {
        if (flag0 && this.a < 0) {
            this.e();
        }
    }

    public void e() {
        this.a = 80;
        if (!this.p.E) {
            this.p.a(this, (byte) 10);
            this.p.a((Entity) this, "game.tnt.primed", 1.0F, 1.0F);
        }
    }

    public boolean v() {
        return this.a > -1;
    }

    public float a(Explosion explosion, World world, int i0, int i1, int i2, Block block) {
        return this.v() && (BlockRailBase.a(block) || BlockRailBase.b_(world, i0, i1 + 1, i2)) ? 0.0F : super.a(explosion, world, i0, i1, i2, block);
    }

    public boolean a(Explosion explosion, World world, int i0, int i1, int i2, Block block, float f0) {
        return this.v() && (BlockRailBase.a(block) || BlockRailBase.b_(world, i0, i1 + 1, i2)) ? false : super.a(explosion, world, i0, i1, i2, block, f0);
    }

    protected void a(NBTTagCompound nbttagcompound) {
        super.a(nbttagcompound);
        if (nbttagcompound.b("TNTFuse", 99)) {
            this.a = nbttagcompound.f("TNTFuse");
        }
    }

    protected void b(NBTTagCompound nbttagcompound) {
        super.b(nbttagcompound);
        nbttagcompound.a("TNTFuse", this.a);
    }
}
