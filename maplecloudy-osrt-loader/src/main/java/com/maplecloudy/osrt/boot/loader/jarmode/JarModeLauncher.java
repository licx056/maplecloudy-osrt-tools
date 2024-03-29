/*
 * Copyright 2012-2020 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.maplecloudy.osrt.boot.loader.jarmode;

/**
 * Delegate class used to launch the fat jar in a specific mode.
 *
 * @author Phillip Webb
 * @since 2.3.0
 */
public final class JarModeLauncher {

	static final String DISABLE_SYSTEM_EXIT = JarModeLauncher.class.getName() + ".DISABLE_SYSTEM_EXIT";

	private JarModeLauncher() {
	}

	public static void main(String[] args) {
//		String mode = System.getProperty("jarmode");
////		String mode = "layertools";
//		List<JarMode> candidates = SpringFactoriesLoader.loadFactories(JarMode.class,
//				ClassUtils.getDefaultClassLoader());
////		List<JarMode> candidates=Collections.singletonList(new LayerToolsJarMode());
//		for (JarMode candidate : candidates) {
//		  if (candidate.accepts(mode)) {
//				candidate.run(mode, args);
//				return;
//			}
//		}
//		System.err.println("Unsupported jarmode '" + mode + "'");
//		if (!Boolean.getBoolean(DISABLE_SYSTEM_EXIT)) {
//			System.exit(1);
//		}
	}

}
