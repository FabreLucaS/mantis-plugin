package hudson.plugins.mantis.changeset;

import hudson.scm.ChangeLogSet;

/**
 * This changeSet has only id.
 * 
 * @author Seiji Sogabe
 * @since 0.7
 */
public class CompatibleChangeSet extends AbstractChangeSet<ChangeLogSet.Entry> {

    private static final long serialVersionUID = 1L;

    public CompatibleChangeSet(final int id) {
        super(id, null, null);
    }

    @Override
    public String createChangeLog() {
        return "";
    }
}
