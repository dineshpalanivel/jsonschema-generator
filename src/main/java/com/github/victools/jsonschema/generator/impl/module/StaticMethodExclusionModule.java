/*
 * Copyright 2019 VicTools.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.victools.jsonschema.generator.impl.module;

import com.github.victools.jsonschema.generator.Module;
import com.github.victools.jsonschema.generator.SchemaGeneratorConfigBuilder;
import java.lang.reflect.Modifier;

/**
 * Default module being included if {@code Option.STATIC_METHODS} is disabled.
 */
public class StaticMethodExclusionModule implements Module {

    @Override
    public void applyToConfigBuilder(SchemaGeneratorConfigBuilder builder) {
        builder.forMethods()
                .addIgnoreCheck(method -> (method.getModifiers() & Modifier.STATIC) == Modifier.STATIC);
    }
}