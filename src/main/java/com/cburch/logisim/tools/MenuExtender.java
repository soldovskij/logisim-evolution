/*
 * Logisim-evolution - digital logic design tool and simulator
 * Copyright by the Logisim-evolution developers
 *
 * https://github.com/logisim-evolution/
 *
 * This is free software released under GNU GPLv3 license
 */

package com.cburch.logisim.tools;

import com.cburch.logisim.proj.Project;
import javax.swing.JPopupMenu;

public interface MenuExtender {
  void configureMenu(JPopupMenu menu, Project proj);
}
