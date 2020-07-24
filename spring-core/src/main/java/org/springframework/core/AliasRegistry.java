/*
 * Copyright 2002-2015 the original author or authors.
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

package org.springframework.core;

/**
 * Common interface for managing aliases. Serves as super-interface for
 * {@link org.springframework.beans.factory.support.BeanDefinitionRegistry}.
 *
 * 译：用于管理别名的通用接口。用作超级接口
 * {@link org.springframework.beans.factory.support.BeanDefinitionRegistry}.
 *
 * @author Juergen Hoeller
 * @since 2.5.2
 */
public interface AliasRegistry {

	/**
	 * Given a name, register an alias for it.
	 * 译：指定名字，为其注册一个别名
	 * @param name the canonical name 规范名称
	 * @param alias the alias to be registered 用于注册的别名
	 * @throws IllegalStateException if the alias is already in use
	 * and may not be overridden 如果别名已经被使用 并且不能被重写
	 *
	 */
	void registerAlias(String name, String alias);

	/**
	 * Remove the specified alias from this registry.
	 * 译：移除指定的别名从注册表
	 * @param alias the alias to remove 需要被移除的别名
	 * @throws IllegalStateException if no such alias was found 如果指定的别名没有被发现
	 */
	void removeAlias(String alias);

	/**
	 * Determine whether this given name is defines as an alias
	 * 译：判断给定的名称是否是别名
	 * (as opposed to the name of an actually registered component).
	 * 译：与实际注册组件的名称相反
	 * @param name the name to check 需要被检查的名称
	 * @return whether the given name is an alias 判断给定的名称是否为别名
	 */
	boolean isAlias(String name);

	/**
	 * Return the aliases for the given name, if defined.
	 * 译：如果指定名称的别名存在，返回别名集合
	 * @param name the name to check for aliases 需要获取的别名的名称
	 * @return the aliases, or an empty array if none 别名集合 如果不存在返回空集合
	 */
	String[] getAliases(String name);

}
