/*
 *
 *  *  Copyright 2016 OrientDB LTD (info(at)orientdb.com)
 *  *
 *  *  Licensed under the Apache License, Version 2.0 (the "License");
 *  *  you may not use this file except in compliance with the License.
 *  *  You may obtain a copy of the License at
 *  *
 *  *       http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  *  Unless required by applicable law or agreed to in writing, software
 *  *  distributed under the License is distributed on an "AS IS" BASIS,
 *  *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  *  See the License for the specific language governing permissions and
 *  *  limitations under the License.
 *  *
 *  * For more information: http://www.orientdb.com
 */

package com.orientechnologies.orient.core.storage.impl.local;

/**
 * Defines the contract for the full checkpoint listeners.
 *
 * @see OAbstractPaginatedStorage#addFullCheckpointListener(OFullCheckpointListener)
 * @see OAbstractPaginatedStorage#removeFullCheckpointListener(OFullCheckpointListener)
 *
 * @author Sergey Sitnikov
 */
public interface OFullCheckpointListener {

  /**
   * Invoked when the full checkpoint made by the storage of interest.
   *
   * @param storage the storage that made the full checkpoint.
   */
  void fullCheckpointMade(OAbstractPaginatedStorage storage);

}