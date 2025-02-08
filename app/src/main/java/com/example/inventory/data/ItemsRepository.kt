/*
 * Copyright (C) 2023 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.inventory.data

import kotlinx.coroutines.flow.Flow

/**
 * Репозиторий, обеспечивающий вставку, обновление, удаление и извлечение [Item] из заданного источника данных.
 */
interface ItemsRepository {
    /**
     * Извлечь все элементы из указанного источника данных.
     */
    fun getAllItemsStream(): Flow<List<Item>>

    /**
     * Извлечь элемент из указанного источника данных, который соответствует [id].
     */
    fun getItemStream(id: Int): Flow<Item>

    /**
     * Вставить элемент в источник данных
     */
    suspend fun insertItem(item: Item)

    /**
     * Удалить элемент из источника данных
     */
    suspend fun deleteItem(item: Item)

    /**
     * Обновить элемент в источнике данных
     */
    suspend fun updateItem(item: Item)
}
