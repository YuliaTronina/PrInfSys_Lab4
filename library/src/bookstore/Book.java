// This is a personal academic project. Dear PVS-Studio, please check it.

// PVS-Studio Static Code Analyzer for C, C++, C#, and Java: https://pvs-studio.com

package bookstore;

import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;

public class Book {
    
    private @Nonnull String author;
    private @Nonnull String title;
    private @CheckForNull String subtitle;

    public @Nonnull String getAuthor() {
        return author;
    }

    public @Nonnull String getSubtitle() {
        return subtitle;
    }

    public @Nonnull String getTitle() {
        return title;
    }

}
