/*
 * Copyright 2015 Olivier Grégoire
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
package be.fror.json;

import java.io.IOException;
import java.util.Objects;

/**
 * @author Olivier Grégoire
 */
public final class JsonNull extends JsonElement {

  private static final JsonNull INSTANCE = new JsonNull();

  static JsonNull instance() {
    return INSTANCE;
  }

  private JsonNull() {
    super(Type.NULL);
  }

  @Override
  void accept(JsonVisitor visitor) {
    visitor.visit(this);
  }

  @Override
  public boolean equals(Object obj) {
    return obj instanceof JsonNull;
  }

  @Override
  public int hashCode() {
    return Objects.hash(JsonNull.class);
  }

  @Override
  void toJsonString(Appendable appendable) throws IOException {
    appendable.append("null");
  }

}
