# Description

A quicker way to get Stash's commit URL.

## Example

```
$ rep_1 (master) $ echo a >> a && git add a && git commit -m "whatever" && git push
[master ece85be] whatever
1 file changed, 1 insertion(+)
Counting objects: 3, done.
Delta compression using up to 4 threads.
Compressing objects: 100% (2/2), done.
Writing objects: 100% (3/3), 279 bytes | 0 bytes/s, done.
Total 3 (delta 1), reused 0 (delta 0)
To http://admin@localhost:7990/stash/scm/project_1/rep_1.git
 0e68b4d..ece85be  master -> master
$ rep_1 (master) $ echo a >> a && git add a && git commit -m "whatever" && git push
[master 909c5b8] whatever
1 file changed, 1 insertion(+)
Counting objects: 3, done.
Delta compression using up to 4 threads.
Compressing objects: 100% (2/2), done.
Writing objects: 100% (3/3), 279 bytes | 0 bytes/s, done.
Total 3 (delta 1), reused 0 (delta 0)
remote: Stash commit URL:
remote: ------------------
remote: http://localhost:7990/stash/projects/PROJECT_1/repos/rep_1/commits/909c5b846364ac9416aad9800bd18b461f5c987b
remote:
To http://admin@localhost:7990/stash/scm/project_1/rep_1.git
 ece85be..909c5b8  master -> master
$ rep_1 (master) $
```