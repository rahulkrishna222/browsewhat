package com.browsewhat.app.factory;

import com.browsewhat.app.entity.generator.ContactUsEntityGenerator;
import com.browsewhat.app.entity.generator.EntityGenerator;
import com.browsewhat.app.types.EntityType;

public class DBEntityGeneratorFactory {

    @SuppressWarnings("rawtypes")
    public static EntityGenerator getEntityGenerator(EntityType type) {
        if (EntityType.ContactUS.equals(type)) {
            return new ContactUsEntityGenerator();
        } else if (EntityType.Bank.equals(type)) {
            return new ContactUsEntityGenerator();
        }
        return null;
    }
}
