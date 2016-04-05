package com.rg.stash.plugin.commit.url.hook;

import com.atlassian.stash.hook.*;
import com.atlassian.stash.hook.repository.*;
import com.atlassian.stash.nav.NavBuilder;
import com.atlassian.stash.project.Project;
import com.atlassian.stash.repository.*;

import java.util.Collection;

public class UrlCommitHook implements PreReceiveRepositoryHook {

    private final NavBuilder navBuilder;

    public UrlCommitHook(final NavBuilder navBuilder) {
        this.navBuilder = navBuilder;
    }

    /**
     * Disables deletion of branches
     */
    public boolean onReceive(RepositoryHookContext context, Collection<RefChange> refChanges, HookResponse hookResponse) {

        Project project = context.getRepository().getProject();
        Repository repository = context.getRepository();
        String txt = "Stash commit URL:\n";
        txt += new String(new char[txt.length()]).replace("\0", "-") + "\n";
        for (RefChange refChange : refChanges) {
            String commitUrl = navBuilder.project(project).repo(repository).commit(refChange.getToHash()).buildAbsolute();
            txt += commitUrl + "\n";
        }
        hookResponse.out().println(txt);
        return true;
    }
}
