package net.minecraft.util;


import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import net.canarymod.api.chat.CanaryChatStyle;
import net.minecraft.event.ClickEvent;
import net.minecraft.event.HoverEvent;

import java.lang.reflect.Type;


public class ChatStyle {

    private ChatStyle a;
    private EnumChatFormatting b;
    private Boolean c;
    private Boolean d;
    private Boolean e;
    private Boolean f;
    private Boolean g;
    private ClickEvent h;
    private HoverEvent i;
    private CanaryChatStyle canaryChatStyle = new CanaryChatStyle(this); // CanaryMod
    public static final ChatStyle j = new ChatStyle() { // CanaryMod: private => public

        public EnumChatFormatting a() {
            return null;
        }

        public boolean b() {
            return false;
        }

        public boolean c() {
            return false;
        }

        public boolean d() {
            return false;
        }

        public boolean e() {
            return false;
        }

        public boolean f() {
            return false;
        }

        public ClickEvent h() {
            return null;
        }

        public HoverEvent i() {
            return null;
        }

        public ChatStyle a(EnumChatFormatting var1) {
            throw new UnsupportedOperationException();
        }

        public ChatStyle a(Boolean var1) {
            throw new UnsupportedOperationException();
        }

        public ChatStyle b(Boolean var1) {
            throw new UnsupportedOperationException();
        }

        public ChatStyle c(Boolean var1) {
            throw new UnsupportedOperationException();
        }

        public ChatStyle d(Boolean var1) {
            throw new UnsupportedOperationException();
        }

        public ChatStyle e(Boolean var1) {
            throw new UnsupportedOperationException();
        }

        public ChatStyle a(ClickEvent var1) {
            throw new UnsupportedOperationException();
        }

        public ChatStyle a(HoverEvent var1) {
            throw new UnsupportedOperationException();
        }

        public ChatStyle a(ChatStyle var1) {
            throw new UnsupportedOperationException();
        }

        public String toString() {
            return "Style.ROOT";
        }

        public ChatStyle l() {
            return this;
        }

        public ChatStyle m() {
            return this;
        }
    };

    public EnumChatFormatting a() {
        return this.b == null ? this.n().a() : this.b;
    }

    public boolean b() {
        return this.c == null ? this.n().b() : this.c.booleanValue();
    }

    public boolean c() {
        return this.d == null ? this.n().c() : this.d.booleanValue();
    }

    public boolean d() {
        return this.f == null ? this.n().d() : this.f.booleanValue();
    }

    public boolean e() {
        return this.e == null ? this.n().e() : this.e.booleanValue();
    }

    public boolean f() {
        return this.g == null ? this.n().f() : this.g.booleanValue();
    }

    public boolean g() {
        return this.c == null && this.d == null && this.f == null && this.e == null && this.g == null && this.b == null && this.h == null && this.i == null;
    }

    public ClickEvent h() {
        return this.h == null ? this.n().h() : this.h;
    }

    public HoverEvent i() {
        return this.i == null ? this.n().i() : this.i;
    }

    public ChatStyle a(EnumChatFormatting enumchatformatting) {
        this.b = enumchatformatting;
        return this;
    }

    public ChatStyle a(Boolean obool) {
        this.c = obool;
        return this;
    }

    public ChatStyle b(Boolean obool) {
        this.d = obool;
        return this;
    }

    public ChatStyle c(Boolean obool) {
        this.f = obool;
        return this;
    }

    public ChatStyle d(Boolean obool) {
        this.e = obool;
        return this;
    }

    public ChatStyle e(Boolean obool) {
        this.g = obool;
        return this;
    }

    public ChatStyle a(ClickEvent clickevent) {
        this.h = clickevent;
        return this;
    }

    public ChatStyle a(HoverEvent hoverevent) {
        this.i = hoverevent;
        return this;
    }

    public ChatStyle a(ChatStyle chatstyle) {
        this.a = chatstyle;
        return this;
    }

    public ChatStyle n() { // CanaryMod: private => public
        return this.a == null ? j : this.a;
    }

    public CanaryChatStyle getWrapper() {
        return canaryChatStyle;
    }

    public String toString() {
        return "Style{hasParent=" + (this.a != null) + ", color=" + this.b + ", bold=" + this.c + ", italic=" + this.d + ", underlined=" + this.e + ", obfuscated=" + this.g + ", clickEvent=" + this.h() + ", hoverEvent=" + this.i() + '}';
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        else if (!(object instanceof ChatStyle)) {
            return false;
        }
        else {
            ChatStyle chatstyle = (ChatStyle) object;
            boolean flag0;

            if (this.b() == chatstyle.b() && this.a() == chatstyle.a() && this.c() == chatstyle.c() && this.f() == chatstyle.f() && this.d() == chatstyle.d() && this.e() == chatstyle.e()) {
                label56:
                {
                    if (this.h() != null) {
                        if (!this.h().equals(chatstyle.h())) {
                            break label56;
                        }
                    }
                    else if (chatstyle.h() != null) {
                        break label56;
                    }

                    if (this.i() != null) {
                        if (!this.i().equals(chatstyle.i())) {
                            break label56;
                        }
                    }
                    else if (chatstyle.i() != null) {
                        break label56;
                    }

                    flag0 = true;
                    return flag0;
                }
            }

            flag0 = false;
            return flag0;
        }
    }

    public int hashCode() {
        int i0 = this.b.hashCode();

        i0 = 31 * i0 + this.c.hashCode();
        i0 = 31 * i0 + this.d.hashCode();
        i0 = 31 * i0 + this.e.hashCode();
        i0 = 31 * i0 + this.f.hashCode();
        i0 = 31 * i0 + this.g.hashCode();
        i0 = 31 * i0 + this.h.hashCode();
        i0 = 31 * i0 + this.i.hashCode();
        return i0;
    }

    public ChatStyle l() {
        ChatStyle chatstyle = new ChatStyle();

        chatstyle.c = this.c;
        chatstyle.d = this.d;
        chatstyle.f = this.f;
        chatstyle.e = this.e;
        chatstyle.g = this.g;
        chatstyle.b = this.b;
        chatstyle.h = this.h;
        chatstyle.i = this.i;
        chatstyle.a = this.a;
        return chatstyle;
    }

    public ChatStyle m() {
        ChatStyle chatstyle = new ChatStyle();

        chatstyle.a(Boolean.valueOf(this.b()));
        chatstyle.b(Boolean.valueOf(this.c()));
        chatstyle.c(Boolean.valueOf(this.d()));
        chatstyle.d(Boolean.valueOf(this.e()));
        chatstyle.e(Boolean.valueOf(this.f()));
        chatstyle.a(this.a());
        chatstyle.a(this.h());
        chatstyle.a(this.i());
        return chatstyle;
    }

    public static class Serializer implements JsonDeserializer, JsonSerializer {

        public ChatStyle deserialize(JsonElement object, Type type2, JsonDeserializationContext jsonserializationcontext1) {
            if (object.isJsonObject()) {
                ChatStyle jsonobject2 = new ChatStyle();
                JsonObject jsonobject3 = object.getAsJsonObject();

                if (jsonobject3.has("bold")) {
                    jsonobject2.c = Boolean.valueOf(jsonobject3.get("bold").getAsBoolean());
                }

                if (jsonobject3.has("italic")) {
                    jsonobject2.d = Boolean.valueOf(jsonobject3.get("italic").getAsBoolean());
                }

                if (jsonobject3.has("underlined")) {
                    jsonobject2.e = Boolean.valueOf(jsonobject3.get("underlined").getAsBoolean());
                }

                if (jsonobject3.has("strikethrough")) {
                    jsonobject2.f = Boolean.valueOf(jsonobject3.get("strikethrough").getAsBoolean());
                }

                if (jsonobject3.has("obfuscated")) {
                    jsonobject2.g = Boolean.valueOf(jsonobject3.get("obfuscated").getAsBoolean());
                }

                if (jsonobject3.has("color")) {
                    jsonobject2.b = (EnumChatFormatting) jsonserializationcontext1.deserialize(jsonobject3.get("color"), EnumChatFormatting.class);
                }

                JsonObject jsonobject1;

                if (jsonobject3.has("clickEvent")) {
                    jsonobject1 = jsonobject3.getAsJsonObject("clickEvent");
                    ClickEvent.Action clickevent_action = ClickEvent.Action.a(jsonobject1.getAsJsonPrimitive("action").getAsString());
                    String s0 = jsonobject1.getAsJsonPrimitive("value").getAsString();

                    if (clickevent_action != null && s0 != null && clickevent_action.a()) {
                        jsonobject2.h = new ClickEvent(clickevent_action, s0);
                    }
                }

                if (jsonobject3.has("hoverEvent")) {
                    jsonobject1 = jsonobject3.getAsJsonObject("hoverEvent");
                    HoverEvent.Action hoverevent_action = HoverEvent.Action.a(jsonobject1.getAsJsonPrimitive("action").getAsString());
                    IChatComponent object0 = (IChatComponent) jsonserializationcontext1.deserialize(jsonobject1.get("value"), IChatComponent.class);

                    if (hoverevent_action != null && object0 != null && hoverevent_action.a()) {
                        jsonobject2.i = new HoverEvent(hoverevent_action, object0);
                    }
                }

                return jsonobject2;
            }
            else {
                return null;
            }
        }

        public JsonElement serialize(ChatStyle object, Type type2, JsonSerializationContext jsonserializationcontext1) {
            if (object.g()) {
                return null;
            }
            else {
                JsonObject jsonobject2 = new JsonObject();

                if (object.c != null) {
                    jsonobject2.addProperty("bold", object.c);
                }

                if (object.d != null) {
                    jsonobject2.addProperty("italic", object.d);
                }

                if (object.e != null) {
                    jsonobject2.addProperty("underlined", object.e);
                }

                if (object.f != null) {
                    jsonobject2.addProperty("strikethrough", object.f);
                }

                if (object.g != null) {
                    jsonobject2.addProperty("obfuscated", object.g);
                }

                if (object.b != null) {
                    jsonobject2.add("color", jsonserializationcontext1.serialize(object.b));
                }

                JsonObject jsonobject3;

                if (object.h != null) {
                    jsonobject3 = new JsonObject();
                    jsonobject3.addProperty("action", object.h.a().b());
                    jsonobject3.addProperty("value", object.h.b());
                    jsonobject2.add("clickEvent", jsonobject3);
                }

                if (object.i != null) {
                    jsonobject3 = new JsonObject();
                    jsonobject3.addProperty("action", object.i.a().b());
                    jsonobject3.add("value", jsonserializationcontext1.serialize(object.i.b()));
                    jsonobject2.add("hoverEvent", jsonobject3);
                }

                return jsonobject2;
            }
        }

        public JsonElement serialize(Object object, Type type2, JsonSerializationContext jsonserializationcontext1) {
            return this.serialize((ChatStyle) object, type2, jsonserializationcontext1);
        }
    }
}
