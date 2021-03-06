package net.canarymod.api.chat;

import net.minecraft.util.EnumChatFormatting;

/**
 * Wrapper implementation for EnumChatFormatting
 *
 * @author Jason (darkdiplomat)
 */
public final class CanaryChatFormatting implements ChatFormatting {
    private EnumChatFormatting nmsFormat;

    public CanaryChatFormatting(EnumChatFormatting nmsFormat) {
        this.nmsFormat = nmsFormat;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public char getFormattingCode() {
        return getNative().a();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isFormat() {
        return getNative().b();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isColor() {
        return getNative().c();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getName() {
        return getNative().d();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return getNative().toString();
    }

    public EnumChatFormatting getNative() {
        return nmsFormat;
    }
}
