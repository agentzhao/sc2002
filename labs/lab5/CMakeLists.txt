cmake_minimum_required(VERSION 3.10)
set(CMAKE_CXX_STANDARD 17)
set(CMAKE_CXX_STANDARD_REQUIRED ON)

set(PROJECT_NAME "lab5")

file(GLOB_RECURSE SOURCES src/*.cpp)
file(GLOB_RECURSE HEADERS src/*.h)

# set the project name and version
project(${PROJECT_NAME} VERSION 1.0)
add_executable(${PROJECT_NAME} ${SOURCES})
target_include_directories(lab5 PUBLIC ${CMAKE_CURRENT_SOURCE_DIR}/include)
