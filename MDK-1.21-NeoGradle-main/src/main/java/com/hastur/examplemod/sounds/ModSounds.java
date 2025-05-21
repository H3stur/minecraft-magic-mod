package com.hastur.examplemod.sounds;

import net.minecraft.core.registries.BuiltInRegistries;

import net.minecraft.sounds.SoundEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(BuiltInRegistries.SOUND_EVENT, "examplemod");

    // All vanilla sounds use variable range events.
    public static final DeferredHolder<SoundEvent, SoundEvent> SECOND_LIGHT = SOUND_EVENTS.register(
            "second_light",
            // Takes in the registry name
            SoundEvent::createVariableRangeEvent
    );

    // There is a currently unused method to register fixed range (= non-attenuating) events as well:
    public static final DeferredHolder<SoundEvent, SoundEvent> MY_FIXED_SOUND = SOUND_EVENTS.register(
            "my_fixed_sound",
            // 16 is the default range of sounds. Be aware that due to OpenAL limitations,
            // values above 16 have no effect and will be capped to 16.
            registryName -> SoundEvent.createFixedRangeEvent(registryName, 16f)
    );
}
