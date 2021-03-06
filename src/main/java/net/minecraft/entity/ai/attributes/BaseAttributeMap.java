package net.minecraft.entity.ai.attributes;


import com.google.common.collect.Multimap;
import net.canarymod.api.attributes.CanaryAttributeMap;
import net.minecraft.server.management.LowerStringMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;


public abstract class BaseAttributeMap {

    protected final Map a = new HashMap();
    protected final Map b = new LowerStringMap();

    public IAttributeInstance a(IAttribute IAttribute) {
        return (IAttributeInstance) this.a.get(IAttribute);
    }

    public IAttributeInstance a(String s0) {
        return (IAttributeInstance) this.b.get(s0);
    }

    public abstract IAttributeInstance b(IAttribute IAttribute);

    public Collection a() {
        return this.b.values();
    }

    public void a(ModifiableAttributeInstance modifiableattributeinstance) {
    }

    public void a(Multimap multimap) {
        Iterator iterator = multimap.entries().iterator();

        while (iterator.hasNext()) {
            Entry entry = (Entry) iterator.next();
            IAttributeInstance attributeinstance = this.a((String) entry.getKey());

            if (attributeinstance != null) {
                attributeinstance.b((AttributeModifier) entry.getValue());
            }
        }

    }

    public void b(Multimap multimap) {
        Iterator iterator = multimap.entries().iterator();

        while (iterator.hasNext()) {
            Entry entry = (Entry) iterator.next();
            IAttributeInstance attributeinstance = this.a((String) entry.getKey());

            if (attributeinstance != null) {
                attributeinstance.b((AttributeModifier) entry.getValue());
                attributeinstance.a((AttributeModifier) entry.getValue());
            }
        }
    }

    // CanaryMod
    public abstract CanaryAttributeMap getWrapper();
}
