## memory-leak

When OOM occurs after a certain period of time has elapsed since the application was started, There are difficulties in obtaining the heap dump file

In this example, the service's selector utilizes a rule that distributes traffic to pods with the same label.

Unlike pods in other deployments, only one pod is terminated by livenessprobe the moment it acquires a heap dump file.

(Also, It's not restarted by `restartPolicy: Never`)
