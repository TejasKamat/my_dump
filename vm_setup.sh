#!/bin/sh

# this contains my github details, if u wanna use plz add your config e.g. git config --global user.name <your-github-user.name> git config --global user.email <your.email@xyz.com>

sudo su # needs root for cloning shits :) 

add-apt-repository ppa:openjdk-r/ppa && apt-get update && apt-get install bison build-essential curl ccache flex lib32ncurses5-dev lib32z1-dev ccache libncurses5-dev libsdl1.2-dev libxml2 libxml2-utils lzop pngcrush schedtool squashfs-tools xsltproc zip zlib1g-dev git-core make gperf openjdk-8-jdk -y && exit 

mkdir ~/bin && PATH=~/bin:$PATH && cd ~/bin && curl http://commondatastorage.googleapis.com/git-repo-downloads/repo > ~/bin/repo && chmod a+x ~/bin/repo && git clone https://github.com/akhilnarang/scripts.git scripts && cd scripts && bash setup/android_build_env.sh && git config --global user.name DrTK001 && git config --global user.email kamattejas77@gmail.com
# :)
