/*
 * Copyright 2020-2023 Typelevel
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package cats.effect.std

import cats.effect.kernel.Sync

private[std] trait ConsoleCompanionPlatform extends ConsoleCompanionCrossPlatform {

  /**
   * Constructs a `Console` instance for `F` data types that are [[cats.effect.kernel.Sync]].
   */
  def make[F[_]](implicit F: Sync[F]): Console[F] =
    new SyncConsole[F]

}
